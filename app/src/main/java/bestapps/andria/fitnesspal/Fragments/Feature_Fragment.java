package bestapps.andria.fitnesspal.Fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import bestapps.andria.fitnesspal.R;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Feature_Fragment extends Fragment {




        Activity myactivity;


//
//        @BindView(R.id.base_health)
//        TextView Base_health;
//
//        @BindView(R.id.Hero_Name)
//        TextView hero_name;



        public Feature_Fragment() {


            // main_activity=getActivity();

        }


        public static Feature_Fragment newInstance(){

            Feature_Fragment myFeatureFragment = new Feature_Fragment();


            return myFeatureFragment;

        }


        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);

            this.myactivity=activity;

            // This makes sure that the container activity has implemented
            // the callback interface. If not, it throws an exception

            try {
              //  myInterfacereference = (Fragment_Interface) activity;

            } catch (ClassCastException e) {

                throw new ClassCastException(activity.toString()

                        + " must implement OnHeadlineSelectedListener");
            }
        }



        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            //check to see if there are players in the database



        }



        @Override

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


            View rootView = inflater.inflate(R.layout.feature_fragment, container, false);

            ButterKnife.bind(this, rootView);



//
            return rootView;
        }





        public void updateFragmentPlayerInfo() {


//            System.out.println("update view in player list fragment");
//            adapter.notifyDataSetChanged();



        }


        public Context getApplicationContext() {

            return this.getContext();
        }



        public void refreshFrame()
        {


            System.out.println("refreshing frame");

            Fragment currentFragment =this;

            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();

            fragmentTransaction.detach(currentFragment);

            fragmentTransaction.attach(currentFragment);

            fragmentTransaction.commit();





        }




    }


