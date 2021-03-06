package com.example.nexgensm.eclairwallet.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.nexgensm.eclairwallet.R;
import com.example.nexgensm.eclairwallet.databinding.FragmentNewRegularPaymentBinding;
import com.example.nexgensm.eclairwallet.presenter.NewRegularPaymentPresenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewRegularPaymentFragment extends Fragment {


    public NewRegularPaymentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       FragmentNewRegularPaymentBinding binding= DataBindingUtil.inflate(inflater,
               R.layout.fragment_new_regular_payment, container, false);
        View root = binding.getRoot();
        binding.setNewRegularPaymentPresenter(new NewRegularPaymentPresenter() {
            @Override
            public void scan() {

            }

            @Override
            public void confirm() {
                //Toast.makeText(getContext(), "hii", Toast.LENGTH_SHORT).show();
                String tag="regular Payment";
                Fragment fragment = new SummaryPurchaseFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content_regular, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return root;
    }

}
