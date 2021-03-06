package com.example.nexgensm.eclairwallet.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nexgensm.eclairwallet.R;
import com.example.nexgensm.eclairwallet.databinding.FragmentNewRegularPaymentBinding;
import com.example.nexgensm.eclairwallet.databinding.FragmentNotificationBinding;
import com.example.nexgensm.eclairwallet.presenter.NotificationPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationFragment extends Fragment {


    public NotificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentNotificationBinding binding= DataBindingUtil.inflate(inflater,R.layout.fragment_notification, container, false);
        View root=binding.getRoot();
        binding.setNotificationPresenter(new NotificationPresenter() {
            @Override
            public void makePayment() {
                Fragment fragment = new PaymentSuccessRegularFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_notification, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }

            @Override
            public void cancel() {

            }
        });
        return root;
    }

}
