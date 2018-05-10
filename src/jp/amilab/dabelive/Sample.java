
package jp.amilab.dabelive;
import jp.vstone.RobotLib.CRobotMem;
import jp.vstone.RobotLib.CRobotPose;
import jp.vstone.RobotLib.CRobotUtil;
import jp.vstone.RobotLib.CSotaMotion;
import jp.vstone.sotatalk.MotionAsSotaWish;
import jp.vstone.sotatalk.SpeechRecog;

public class Sample {
	public static void main(String[] arg)
	{
		if(GlobalVariable.mem.Connect())
		{
			GlobalVariable.motion.InitRobot_Sota();
			if(GlobalVariable.InitServoOn)
			{
				GlobalVariable.motion.ServoOn();
				// 初期位置に設定
				CRobotPose pose = new CRobotPose();
				pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{0,-900,0,900,0,0,0,0}
								);
				pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
								new Short[]{100,100,100,100,100,100,100,100}
								);
				pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
								new Short[]{0,-255,0,180,80,0,180,80,0}
								);
				GlobalVariable.motion.play(pose,1500);
				CRobotUtil.wait(1500);
			}
			int sid = 0;
			jp.amilab.dabelive.channel ch = new jp.amilab.dabelive.channel();
			jp.amilab.dabelive.Motion move = new jp.amilab.dabelive.Motion();
			jp.amilab.dabelive.DabeMain DabeMain = new jp.amilab.dabelive.DabeMain();

			move.sad();
			move.angry();
			move.cock();
			move.banzai();


			ch.channel_func();

			while(true) {
				try {
					DabeMain.main(sid);
//					CRobotUtil.wait(7000);
			}
				catch(Exception e)
			{
					System.out.println("例外が発生しました:");
					e.printStackTrace();
					System.exit(0);
			}

		}
	}
	}
	public static class GlobalVariable
	{
		public static CRobotMem mem = new CRobotMem();
		public static CSotaMotion motion = new CSotaMotion(mem);
		public static boolean InitServoOn = true;
		public static boolean TRUE = true;
		public static SpeechRecog recog = new SpeechRecog(motion);
		public static MotionAsSotaWish sotawish = new MotionAsSotaWish(motion);
	}

}

