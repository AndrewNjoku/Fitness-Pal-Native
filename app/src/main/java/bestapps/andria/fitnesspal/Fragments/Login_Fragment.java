package bestapps.andria.fitnesspal.Fragments;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

import bestapps.andria.fitnesspal.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class Login_Fragment extends Fragment{


        Activity myactivity;

        @BindView(R.id.email);
        AutoCompleteTextView email;

        @BindView(R.id.password);
        AutoCompleteTextView password;

        @BindView(R.id.email_sign_in_button);
        Button loginButton;



        public Login_Fragment() {


            // main_activity=getActivity();

        }


        public static Login_Fragment newInstance(){

            Login_Fragment myLoginFragment = new Login_Fragment();


            return myLoginFragment;

        }


        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);

            this.myactivity=activity;

            // This makes sure that the container activity has implemented
            // the callback interface. If not, it throws an exception

            try {
                //myInterfacereference = (Fragment_Interface) activity;

            } catch (ClassCastException e) {

                throw new ClassCastException(activity.toString()

                        + " must implement OnHeadlineSelectedListener");
            }
        }



        @Override
        public void onCreate(Bundle savedInstanceState) {


            super.onCreate(savedInstanceState);


            // Creaate Presenter for this fragment





            //check to see if there are players in the database



        }


        @Override

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.login_fragment, container, false);

            ButterKnife.bind(this, rootView);



            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                }
            });


//
            return rootView;
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
