package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adapter.MyBaseAdapter;
import fsj.bawei.com.app4_zhoukao1.R;
import xlistview.bawei.com.xlistviewlibrary.XListView;
import xutils.MyXUtils;

/**
 * date:2017/4/10 18:59
 * author: 冯思佳.
 * 类描述：
 */

public class MyFragment extends Fragment {


    private View mV;
    private XListView mXlv;

    public static MyFragment getFragment(String uri){
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url",uri);
        myFragment.setArguments(bundle);
        return myFragment;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mV = inflater.inflate(R.layout.fragment_xlv_layout,null);
        initView();
        return mV;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle arguments = getArguments();
        String url = arguments.getString("url");

        MyXUtils myXUtils = new MyXUtils();
        myXUtils.DoGet();
    }

    private void initView() {
        mXlv = (XListView) mV.findViewById(R.id.xlv);
       // mXlv.setAdapter(new MyBaseAdapter(getActivity(),));
    }
}
