package xutils;

import android.util.Log;

import com.google.gson.Gson;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import utils.Url;

/**
 * date:2017/4/10 19:53
 * author: 冯思佳.
 * 类描述：
 */

public class MyXUtils {
    public String DoGet(){
        RequestParams params = new RequestParams(Url.path1);
        params.addQueryStringParameter("uri","gj");
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {

                Log.d("zzz", result.toString());
            }
            //请求异常后的回调方法
            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.d("fff", "请求异常");
            }
            //主动调用取消请求的回调方法
            @Override
            public void onCancelled(CancelledException cex) {
                Log.d("fff", "取消请求");
            }
            @Override
            public void onFinished() {
            }
        });

        return null;
    }
}

