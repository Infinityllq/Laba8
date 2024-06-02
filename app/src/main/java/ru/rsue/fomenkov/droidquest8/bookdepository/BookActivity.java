package ru.rsue.fomenkov.droidquest8.bookdepository;

import androidx.activity.EdgeToEdge;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

public class BookActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new BookFragment();
    }

}
