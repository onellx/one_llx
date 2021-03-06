import com.itrip.utils.HttpClientUtil;

public class DemoSMS {


    //用户名
    private static String Uid = "uid";

    //接口安全秘钥
    private static String Key = "key";

    //手机号码，多个号码如13800000000,13800000001,13800000002
    private static String smsMob = "18279265280";

    //短信内容
    private static String smsText = "验证码：8888";


    public static void main(String[] args) {

        HttpClientUtil client = HttpClientUtil.getInstance();

        //UTF发送
        int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);
        if(result>0){
            System.out.println("UTF8成功发送条数=="+result);
        }else{
            System.out.println(client.getErrorMsg(result));
        }
    }
}
