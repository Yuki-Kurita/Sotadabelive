package jp.amilab.dabelive;

import jp.vstone.RobotLib.CPlayWave;
import jp.vstone.RobotLib.CRobotMem;
import jp.vstone.RobotLib.CSotaMotion;
import jp.vstone.sotatalk.SpeechRecog;
import jp.vstone.sotatalk.SpeechRecog.RecogResult;
import jp.vstone.sotatalk.TextToSpeechSota;

public class channel {
	public void channel_func() {
//		int i = 0;
//		int index = 0;
//		int NHK = 1;
//		int NHKsougou = 2;
//		int Nihon = 3;
//		int TBS = 4;
//		int Fuji = 5;
//		int Asahi = 6;
//		int Tokyo = 7;
//		int TV[] = {NHK, NHKsougou, Nihon, TBS, Fuji, Asahi, Tokyo};
		int sid = 0;
		DabeliveSota dabelive = new DabeliveSota();
		CRobotMem mem = new CRobotMem();
		CSotaMotion motion = new CSotaMotion(mem);
		SpeechRecog recog = new SpeechRecog(motion);

		CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("チャンネルを選んでね!"),true);

		while(true){

		RecogResult channel = recog.getRecognition(10000);

		if(channel.getBasicResult() == null) {
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("またね！"),true);
			break;
		}
	// チャンネルを聞かれた場合,音声処理
		if(channel.getBasicResult().contains("チャンネル")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("チャンネルはNHK、NHK総合、日本テレビ、TBSテレビ、フジテレビ、テレビ朝日、テレビ東京があるよ!"),true);
			continue;
		}
		if(channel.getBasicResult().contains("ｎｈｋ")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("NHKだね！始めるよ！"),true);
			sid = 0;
			break;
		}
		if(channel.getBasicResult().contains("ｎｈｋ総合")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("NHK総合だね！始めるよ！"),true);
			sid = 41;
			break;
		}
		if(channel.getBasicResult().contains("日本")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("日本テレビだね！始めるよ！"),true);
			sid = 42;
			break;

		}
		if(channel.getBasicResult().contains("ｔｂｓ")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("TBSテレビだね！始めるよ！"),true);
			sid = 43;
			break;
		}
		if(channel.getBasicResult().contains("フジ")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("フジテレビだね！始めるよ！"),true);
			sid = 44;
			break;
		}
		if(channel.getBasicResult().contains("朝日")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("テレビ朝日だね！始めるよ！"),true);
			sid = 45;
			break;
		}
		if(channel.getBasicResult().contains("東京")){
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("テレビ東京だね！始めるよ！"),true);
			sid = 46;
			break;
		}

		else {
			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("ごめんね。聞き取れなかったよ。もう一度お願い。"),true);
		}
		// ボタン処理
//		if(motion.isButton_VolDown()){
//			index = TV[i];
//			i++;
//			if (i > 7){
//				i = 0;
//			}
//			if(index == 1) {
//				CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("NHKだね？"),true);
//				sid = 0;
//			}
//			if(index == 2) {
//				CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("NHK総合だね？"),true);
//				sid = 41;
//			}
//			if(index == 3) {
//				CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("日本テレビだね？"),true);
//				sid = 42;
//			}
//			if(index == 4) {
//				CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("TBSテレビだね？"),true);
//				sid = 43;
//			}
//			if(index == 5) {
//				CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("フジテレビだね？"),true);
//				sid = 44;
//			}
//			if(index == 6) {
//				CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("テレビ朝日だね?"),true);
//				sid = 45;
//			}
//			if(index == 7) {
//				CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("テレビ東京だね？"),true);
//				sid = 46;
//			}
//		}
//		if(motion.isButton_VolUp()){
//			i--;
//			index = TV[i];
//			if(i < 0) {
//				i = 6;
//			}
//				if(index == 1) {
//					CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("NHKだね？"),true);
//					sid = 0;
//				}
//				if(index == 2) {
//					CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("NHK総合だね？"),true);
//					sid = 41;
//				}
//				if(index == 3) {
//					CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("日本テレビだね？"),true);
//					sid = 42;
//				}
//				if(index == 4) {
//					CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("TBSテレビだね？"),true);
//					sid = 43;
//				}
//				if(index == 5) {
//					CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("フジテレビだね？"),true);
//					sid = 44;
//				}
//				if(index == 6) {
//					CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("テレビ朝日だね?"),true);
//					sid = 45;
//				}
//				if(index == 7) {
//					if(index == 7) {
//						CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("テレビ東京だね？"),true);
//						sid = 46;
//					}
//				}
//		}
//		// 電源ボタンを押した場合
//		if(motion.isButton_Power()){
//			CPlayWave.PlayWave(TextToSpeechSota.getTTSFile("始めるよ！"),true);
//			break;
//		}
		}
		dabelive.main(sid);
}
}
//	public static void select() {
////	if(index == 1) {
////
////	}
////	if(index == 2) {
////
////	}
////	if(index == 3) {
////
////	}
////	if(index == 4) {
////
////	}
////	if(index == 5) {
////
////	}
////	if(index == 6) {
////
////	}
////	if(index == 7) {
////
////	}
//	}
//}
