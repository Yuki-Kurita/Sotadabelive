package jp.amilab.dabelive;
import java.awt.Color;

import jp.vstone.RobotLib.CRobotMem;
import jp.vstone.RobotLib.CRobotPose;
import jp.vstone.RobotLib.CSotaMotion;
/**
 * VSMDを使用し、モーション再生・音声再生するサンプル
 * @author Vstone
 *
 */
public class Motion {

	public void banzai() {
		//VSMDと通信ソケット・メモリアクセス用クラス
		CRobotMem mem = new CRobotMem();
		//Sota用モーション制御クラス
		CSotaMotion motion = new CSotaMotion(mem);
		//一部の軸を指定して動作
		//CSotaMotionの定数を利用してID指定する場合
		CRobotPose pose = new CRobotPose();
		// 万歳させる
		pose.SetPose(new Byte[] {CSotaMotion.SV_L_SHOULDER, CSotaMotion.SV_R_SHOULDER}	//id
					,  new Short[]{800, -800}	//target pos
		);
		// LED点灯
		pose.setLED_Sota(Color.YELLOW, Color.YELLOW, 255, Color.YELLOW);
		//1000msecで動かす
		motion.play(pose,2500);
		motion.waitEndinterpAll();

		//元のポーズにセット
		pose = new CRobotPose();
		pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}	//id
					,  new Short[]{0   ,-900   ,0   ,900   ,0   ,0   ,0   ,0}	//target pos
		);
		pose.setLED_Sota(Color.YELLOW, Color.YELLOW, 255, Color.YELLOW);
		motion.play(pose,2500);
		motion.waitEndinterpAll();


	}

	public void cock() {
	//VSMDと通信ソケット・メモリアクセス用クラス
	CRobotMem mem = new CRobotMem();
	//Sota用モーション制御クラス
	CSotaMotion motion = new CSotaMotion(mem);
	//一部の軸を指定して動作
	//CSotaMotionの定数を利用してID指定する場合
	CRobotPose pose = new CRobotPose();
	// 首をかしげる
	pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_R}	//id
				,  new Short[]{200}	//target pos
	);
	// LED点灯
	pose.setLED_Sota(Color.BLUE, Color.BLUE, 255, Color.BLUE);
	//1000msecで動かす
	motion.play(pose,2000);
	motion.waitEndinterpAll();

	//元のポーズにセット
	pose = new CRobotPose();
	pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}	//id
				,  new Short[]{0   ,-900   ,0   ,900   ,0   ,0   ,0   ,0}	//target pos
	);
	pose.setLED_Sota(Color.BLUE, Color.BLUE, 255, Color.BLUE);
	motion.play(pose,2000);
	motion.waitEndinterpAll();
}

	public void nod() {
	//VSMDと通信ソケット・メモリアクセス用クラス
	CRobotMem mem = new CRobotMem();
	//Sota用モーション制御クラス
	CSotaMotion motion = new CSotaMotion(mem);
	//一部の軸を指定して動作
	//CSotaMotionの定数を利用してID指定する場合
	CRobotPose pose = new CRobotPose();
	// うなづく
	pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_P}	//id
				,  new Short[]{-250}	//target pos
	);
	// LED点灯
	pose.setLED_Sota(Color.ORANGE, Color.ORANGE, 255, Color.ORANGE);
	//1000msecで動かす
	motion.play(pose,1000);
	motion.waitEndinterpAll();

	pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_P}, new Short[]{50});
	motion.play(pose,1000);
	motion.waitEndinterpAll();

	pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_P}, new Short[]{-250});
	motion.play(pose,1000);
	motion.waitEndinterpAll();

	pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_P}, new Short[]{50});
	motion.play(pose,1000);
	motion.waitEndinterpAll();

	//元のポーズにセット
	pose = new CRobotPose();
	pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}	//id
				,  new Short[]{0   ,-900   ,0   ,900   ,0   ,0   ,0   ,0}	//target pos
	);
	pose.setLED_Sota(Color.ORANGE, Color.ORANGE, 255, Color.ORANGE);
	motion.play(pose,1000);
	motion.waitEndinterpAll();
}

	public void angry() {
	//VSMDと通信ソケット・メモリアクセス用クラス
	CRobotMem mem = new CRobotMem();
	//Sota用モーション制御クラス
	CSotaMotion motion = new CSotaMotion(mem);
	//一部の軸を指定して動作
	//CSotaMotionの定数を利用してID指定する場合
	CRobotPose pose = new CRobotPose();
	// 怒る
	pose.SetPose(new Byte[] {CSotaMotion.SV_L_SHOULDER, CSotaMotion.SV_R_SHOULDER, CSotaMotion.SV_L_ELBOW, CSotaMotion.SV_R_ELBOW}	//id
				,  new Short[]{300, -300, -600, 600}	//target pos
	);
	// LED点灯
	pose.setLED_Sota(Color.RED, Color.RED, 255, Color.RED);
	//1000msecで動かす
	motion.play(pose,1000);
	motion.waitEndinterpAll();

	pose.SetPose(new Byte[] {CSotaMotion.SV_L_SHOULDER, CSotaMotion.SV_R_SHOULDER, CSotaMotion.SV_L_ELBOW, CSotaMotion.SV_R_ELBOW}	//id
	,  new Short[]{0, 0, -200, 200}	//target pos
);
	motion.play(pose,1000);
	motion.waitEndinterpAll();

	pose.SetPose(new Byte[] {CSotaMotion.SV_L_SHOULDER, CSotaMotion.SV_R_SHOULDER, CSotaMotion.SV_L_ELBOW, CSotaMotion.SV_R_ELBOW}	//id
	,  new Short[]{300, -300, -600, 600}	//target pos
);
	motion.play(pose,1000);
	motion.waitEndinterpAll();

	//元のポーズにセット
	pose = new CRobotPose();
	pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}	//id
				,  new Short[]{0   ,-900   ,0   ,900   ,0   ,0   ,0   ,0}	//target pos
	);
	pose.setLED_Sota(Color.RED, Color.RED, 255, Color.RED);
	motion.play(pose,1000);
	motion.waitEndinterpAll();


}

	public void shake() {
		//VSMDと通信ソケット・メモリアクセス用クラス
		CRobotMem mem = new CRobotMem();
		//Sota用モーション制御クラス
		CSotaMotion motion = new CSotaMotion(mem);
		//一部の軸を指定して動作
		//CSotaMotionの定数を利用してID指定する場合
		CRobotPose pose = new CRobotPose();
		// 首を振る
		pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_Y}	//id
					,  new Short[]{400}	//target pos
		);
		// LED点灯
		pose.setLED_Sota(Color.GREEN, Color.GREEN, 255, Color.GREEN);
		//1000msecで動かす
		motion.play(pose,1500);
		motion.waitEndinterpAll();

		pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_Y}	//id
		,  new Short[]{-400}	//target pos
	);
		motion.play(pose,1500);
		motion.waitEndinterpAll();

		pose.SetPose(new Byte[] {CSotaMotion.SV_HEAD_Y}	//id
		,  new Short[]{400}	//target pos
	);
		motion.play(pose,1500);
		motion.waitEndinterpAll();


		//元のポーズにセット
		pose = new CRobotPose();
		pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}	//id
					,  new Short[]{0   ,-900   ,0   ,900   ,0   ,0   ,0   ,0}	//target pos
		);
		pose.setLED_Sota(Color.GREEN, Color.GREEN, 255, Color.GREEN);
		motion.play(pose,2000);
		motion.waitEndinterpAll();


	}

	public void bossy() {
		//VSMDと通信ソケット・メモリアクセス用クラス
		CRobotMem mem = new CRobotMem();
		//Sota用モーション制御クラス
		CSotaMotion motion = new CSotaMotion(mem);
		//一部の軸を指定して動作
		//CSotaMotionの定数を利用してID指定する場合
		CRobotPose pose = new CRobotPose();
		// 自慢する
		pose.SetPose(new Byte[] {CSotaMotion.SV_L_SHOULDER, CSotaMotion.SV_R_SHOULDER, CSotaMotion.SV_L_ELBOW, CSotaMotion.SV_R_ELBOW}	//id
					,  new Short[]{300, -300, -600, 600}	//target pos
		);
		// LED点灯
		pose.setLED_Sota(Color.RED, Color.RED, 255, Color.RED);
		//1000msecで動かす
		motion.play(pose,2000);
		motion.waitEndinterpAll();

		pose.SetPose(new Byte[] {CSotaMotion.SV_L_SHOULDER, CSotaMotion.SV_R_SHOULDER, CSotaMotion.SV_L_ELBOW, CSotaMotion.SV_R_ELBOW}	//id
		,  new Short[]{0, 0, -200, 200}	//target pos
	);
		motion.play(pose,2000);
		motion.waitEndinterpAll();

		pose.SetPose(new Byte[] {CSotaMotion.SV_L_SHOULDER, CSotaMotion.SV_R_SHOULDER, CSotaMotion.SV_L_ELBOW, CSotaMotion.SV_R_ELBOW}	//id
		,  new Short[]{300, -300, -600, 600}	//target pos
	);
		motion.play(pose,2000);
		motion.waitEndinterpAll();

		//元のポーズにセット
		pose = new CRobotPose();
		pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}	//id
					,  new Short[]{0   ,-900   ,0   ,900   ,0   ,0   ,0   ,0}	//target pos
		);
		pose.setLED_Sota(Color.RED, Color.RED, 255, Color.RED);
		motion.play(pose,2000);
		motion.waitEndinterpAll();

	}
	public void laugh() {
	//初期位置
	//VSMDと通信ソケット・メモリアクセス用クラス
	CRobotMem mem = new CRobotMem();
	//Sota用モーション制御クラス
	CSotaMotion motion = new CSotaMotion(mem);
	//一部の軸を指定して動作
	//CSotaMotionの定数を利用してID指定する場合
	CRobotPose pose = new CRobotPose();
	pose = new CRobotPose();
	pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}
	,  new Short[]{0   ,-900,0   ,900 ,0   ,0   ,-100   ,0});
	//軸を動作
	pose.SetPose(new Byte[] {2,3,4,5,6,7}
	,  new Short[]{100, -700, 900, 0, 300, 50 });

	//LEDを点灯（左目、右目、口：Max、電源ボタン：赤）
	pose.setLED_Sota(Color.YELLOW, Color.YELLOW, 255, Color.YELLOW);

	//補間完了まで待つ
	motion.waitEndinterpAll();


	pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}
	,  new Short[]{0   ,-900,0   ,900 ,0   ,0   ,-100   ,0});

	//補間完了まで待つ
	motion.waitEndinterpAll();
		}

	public void sad() {
		CRobotPose pose;
		//VSMDと通信ソケット・メモリアクセス用クラス
		CRobotMem mem = new CRobotMem();
		//Sota用モーション制御クラス
		CSotaMotion motion = new CSotaMotion(mem);

		if(mem.Connect()){
			//Sota仕様にVSMDを初期化
			motion.InitRobot_Sota();

			motion.ServoOn();
			//初期位置
			pose = new CRobotPose();
			pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}
			,  new Short[]{0   ,-900,0   ,900 ,0   ,0   ,-100   ,0});
		//軸を動作
			pose.SetPose(new Byte[] {2,3,4,5,7}
			,  new Short[]{100, -800, -100, 800, 50 });

			//LEDを点灯（左目：赤、右目：赤、口：Max、電源ボタン：赤）
			pose.setLED_Sota(Color.BLUE, Color.BLUE, 255, Color.BLUE);

			//補間完了まで待つ
			motion.waitEndinterpAll();

			pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}
			,  new Short[]{0   ,-900,0   ,900 ,0   ,0   ,-100   ,0});
			//補間完了まで待つ
			motion.waitEndinterpAll();

		}

	}

	public void scared() {
		CRobotPose pose;
		//VSMDと通信ソケット・メモリアクセス用クラス
		CRobotMem mem = new CRobotMem();
		//Sota用モーション制御クラス
		CSotaMotion motion = new CSotaMotion(mem);

		if(mem.Connect()){
			//Sota仕様にVSMDを初期化
			motion.InitRobot_Sota();
			motion.ServoOn();


			//初期位置
			pose = new CRobotPose();
			pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}
			,  new Short[]{0   ,-900,0   ,900 ,0   ,0   ,-100   ,0});

			//軸を動作
			pose.SetPose(new Byte[] {2,3,4,5,7}
			,  new Short[]{450, -450, -450, 450, 50 });

			//LEDを点灯（左目：赤、右目：赤、口：Max、電源ボタン：赤）
			pose.setLED_Sota(Color.BLUE, Color.BLUE, 255, Color.BLUE);
			//補間完了まで待つ
			motion.waitEndinterpAll();

			pose.SetPose(new Byte[] {1   ,2   ,3   ,4   ,5   ,6   ,7   ,8}
			,  new Short[]{0   ,-900,0   ,900 ,0   ,0   ,-100   ,0});

			//補間完了まで待つ
			motion.waitEndinterpAll();


		}
	}
}