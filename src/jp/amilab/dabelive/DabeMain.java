package jp.amilab.dabelive;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.Gson;

import jp.amilab.dabelive.DabeliveSota.GlobalVariable;
import jp.vstone.sotatalk.MotionAsSotaWish;

public class DabeMain {
	public DabeMain()
	{

	}

	public void main(int sid)throws IOException{

		String text=null;
		//とりあえずチャンネルは42 固定で実装
		URL url = new URL("http://cs.ami-lab.jp/api2/comment_stream2.php?sid="+(sid));
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		BufferedReader responseBody = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line = "";

        while(true) {
        	//レスポンスを一行ずつ読み込む。だべらいぶは id,event,dataの3行が1回で返ってくる。
        	//今回のターゲットは dataの中身。行頭がdataであればwhileを抜ける
        	line = responseBody.readLine();
        	line.toString();
        	String regex = "^data";
        	Pattern p = Pattern.compile(regex);
        	Matcher m = p.matcher(line);
        	if(m.find()) {
        		break;
        	}
        }
        // Json形式で記述されているのはレスポンスの「data :{----}」の{}の中身、従って6文字目以降をbodyとして取得する
        String body = line.substring(6);

		// Gson : Jsonをjavaで扱うためのライブラリ
        Gson gson = new Gson();

		// だべらいぶサーバーから返ってきたJSONをDabeResponse.classで定義したルールで格納
		DabeResponse comment = gson.fromJson(body, DabeResponse.class);
		text = comment.yomi;
		System.out.println(text);

		GlobalVariable.sotawish.Say((String)text,MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);
		//CPlayWave.PlayWave(TextToSpeechSota.getTTS(text),true);

	}
}
