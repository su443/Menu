package mx.edu.tesoem.isc.svj.menu.ui.factorial;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.edu.tesoem.isc.svj.menu.R;

public class FactorialFragment extends Fragment {

    private FactorialViewModel mViewModel;

    public static FactorialFragment newInstance() {
        return new FactorialFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.factorial_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(FactorialViewModel.class);
        // TODO: Use the ViewModel
    }

}