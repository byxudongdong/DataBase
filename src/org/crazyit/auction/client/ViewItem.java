package org.crazyit.auction.client;

import org.crazyit.app.base.FragmentActivity;

import android.app.Fragment;
import android.os.Bundle;

public class ViewItem extends FragmentActivity
{
	// ��дgetFragment()��������Activity��ʾ�÷������ص�Fragment
	@Override
	protected Fragment getFragment()
	{
		ViewItemFragment fragment = new ViewItemFragment();
		Bundle arguments = new Bundle();
		arguments.putString("action"
				, getIntent().getStringExtra("action"));
		fragment.setArguments(arguments);
		return fragment;
	}
}
