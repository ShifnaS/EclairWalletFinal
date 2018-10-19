package com.example.nexgensm.eclairwallet.fragment;


import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nexgensm.eclairwallet.R;

import com.example.nexgensm.eclairwallet.activity.HomeActivity;
import com.example.nexgensm.eclairwallet.databinding.FragmentInviceScheduleDetailsBinding;
import com.example.nexgensm.eclairwallet.presenter.InvoiceSchedulePresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class InviceScheduleDetailsFragment extends Fragment {


    public InviceScheduleDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentInviceScheduleDetailsBinding binding= DataBindingUtil.inflate(inflater,R.layout.fragment_invice_schedule_details,container,false);
        View root=binding.getRoot();
        binding.setInvoiceSchedulePresenter(new InvoiceSchedulePresenter() {
            @Override
            public void cancel() {
                Intent i=new Intent(getContext(), HomeActivity.class);
                startActivity(i);
            }
        });
        return root;
    }

}
