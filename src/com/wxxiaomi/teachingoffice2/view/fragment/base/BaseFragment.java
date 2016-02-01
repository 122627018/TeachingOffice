package com.wxxiaomi.teachingoffice2.view.fragment.base;


import com.actionbarsherlock.app.SherlockFragment;
import com.wxxiaomi.teachingoffice2.R;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnTouchListener;

public abstract class BaseFragment extends SherlockFragment implements
		 OnTouchListener {
	public View view;
	public Context ct;
	public FragmentCallback interFace;
	protected View loadingView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		ct = getActivity();
		super.onCreate(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = initView(inflater);
		loadingView = view.findViewById(R.id.loading_view);
		return view;
	}
	public void dismissLoadingView() {
		if (loadingView != null)
			loadingView.setVisibility(View.INVISIBLE);
	}

	public View getRootView() {
		return view;
	}

	/**
	 * 模拟后�?�?	 */
	protected void back() {
		FragmentManager fragmentManager = getFragmentManager();
		fragmentManager.popBackStackImmediate();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.support.v4.app.Fragment#onViewCreated(android.view.View,
	 * android.os.Bundle)
	 */
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		view.setOnTouchListener(this);
		super.onViewCreated(view, savedInstanceState);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.view.View.OnTouchListener#onTouch(android.view.View,
	 * android.view.MotionEvent)
	 */
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		
		// 拦截触摸事件，防止传递到下一层的View
		return true;
	}

	public void dispatchCommand(int id, Bundle args) {
		if (getActivity() instanceof FragmentCallback) {
			FragmentCallback callback = (FragmentCallback) getActivity();
			callback.onFragmentCallback(this, id, args);
		} else {
			throw new IllegalStateException(
					"The host activity does not implement FragmentCallback.");
		}
	}



	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {

		super.onActivityCreated(savedInstanceState);
		initData(savedInstanceState);
	}

	/**
	 * 初始化view
	 */
	public abstract View initView(LayoutInflater inflater);

	/**
	 * 初始化数�?	 */
	public abstract void initData(Bundle savedInstanceState);

//	@Override
//	public void onActivityResult(int requestCode, int resultCode, Intent data) {
//		super.onActivityResult(requestCode, resultCode, data);
//	}
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		 try{  
	          interFace =(FragmentCallback)activity;  
	      }catch(ClassCastException e){  
	          throw new ClassCastException(activity.toString()+"must implement OnArticleSelectedListener");  
	      }  
	}
}
