package edu.com.mvpcommon.news.newsList;

import java.util.ArrayList;

import edu.com.mvplibrary.model.bean.Channel;

import edu.com.mvplibrary.presenter.BasePresenter;
import edu.com.mvplibrary.ui.BaseView;

/**
 * Created by Anthony on 2016/5/3.
 * Class Note:
 * 1 define your Views & Presenters in Contract Classes;
 * 2 define listener used for View & Model indirectly interaction;
 * 3 {@link NewsContract}-------------------------------------------Manager role of MVP
 * {@link NewsPresenter}---------Presenter
 * &{@link NewsFragment}---------------------------View
 * &{@link  NewsData}--------------------Model
 *
 */
public interface NewsContract {

    interface Presenter extends BasePresenter{
        void getData(String url);

    }

    interface View  extends BaseView{
        void onDataReceived(ArrayList<Channel> channels);
    }

    interface onGetChannelListListener{
        void onSuccess();
        void onError();
    }
}
