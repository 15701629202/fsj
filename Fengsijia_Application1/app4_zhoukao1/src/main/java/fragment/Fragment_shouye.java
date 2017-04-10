package fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import adapter.MyAdapter;
import fsj.bawei.com.app4_zhoukao1.R;

/**
 * date:2017/4/10 19:23
 * author: 冯思佳.
 * 类描述：
 */

public class Fragment_shouye extends Fragment {

    private TabLayout mTab;
    private ViewPager mVp;
    private View mV;
    private List<Fragment> list = new ArrayList<Fragment>();
    private String[] titleArr = new String[]{"头条","国际","时尚","财经","国内","体育","娱乐","科技","社会","军事"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mV = inflater.inflate(R.layout.fragment_shouye,null);
        initView();
        return mV;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        addFragment();
        MyAdapter adapter = new MyAdapter(getChildFragmentManager(), titleArr, list);
        mVp.setAdapter(adapter);

    }
    private void initView() {
        mTab = (TabLayout) mV.findViewById(R.id.tabl);
        mVp = (ViewPager) mV.findViewById(R.id.vp);
    }
    private void addFragment() {
        list.add(MyFragment.getFragment("tt"));
        list.add(MyFragment.getFragment("gj"));
        list.add(MyFragment.getFragment("ss"));
        list.add(MyFragment.getFragment("cj"));
        list.add(MyFragment.getFragment("gn"));
        list.add(MyFragment.getFragment("ty"));
        list.add(MyFragment.getFragment("yl"));
        list.add(MyFragment.getFragment("kj"));
        list.add(MyFragment.getFragment("shehui"));
        list.add(MyFragment.getFragment("js"));


    }

}
