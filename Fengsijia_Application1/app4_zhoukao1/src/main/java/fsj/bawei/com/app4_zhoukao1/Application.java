package fsj.bawei.com.app4_zhoukao1;

import org.xutils.x;

/**
 * date:2017/4/10 19:59
 * author: 冯思佳.
 * 类描述：
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false); //输出debug日志，开启会影响性能
    }
}
