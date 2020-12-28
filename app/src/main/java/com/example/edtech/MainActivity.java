package com.example.edtech;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;




        import android.view.KeyEvent;
        import android.view.MenuItem;


        import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }




        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        venueadapter customAdapter = new venueadapter(MainActivity.this, city(),seat(), ground_name(),home_ground());
        mRecyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
        customAdapter.notifyDataSetChanged();



        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        venueadapter2 customAdapter2 = new venueadapter2(MainActivity.this, city(),seat(), ground_name(),home_ground());
        mRecyclerView.setAdapter(customAdapter2); // set the Adapter to RecyclerView
        customAdapter2.notifyDataSetChanged();



        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view3);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        venueadapter3 customAdapter3 = new venueadapter3(MainActivity.this, city(),seat(), ground_name(),home_ground());
        mRecyclerView.setAdapter(customAdapter3); // set the Adapter to RecyclerView
        customAdapter3.notifyDataSetChanged();
































































    }

    public ArrayList<String> city() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Bengaluru");
        list.add("Delhi");
        list.add("Hyderabad ");
        list.add("Indore");
        list.add("Jaipur");
        list.add("Kolkata");
        list.add("Mohali");
        list.add("Mumbai");
        list.add("Pune");
        list.add("Chennai");

        return list;
    }

    public ArrayList<String> seat() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Seating Capacity: 35,000");
        list.add("Seating Capacity: 41,820");
        list.add("Seating Capacity: 39,408");
        list.add("Seating Capacity: 30,000");
        list.add("Seating Capacity: 23,185");
        list.add("Seating Capacity: 68,000");
        list.add("Seating Capacity: 26,000");
        list.add("Seating Capacity: 33,000");
        list.add("Seating Capacity: 42,000");
        list.add("Seating Capacity: 33,500");

        return list;
    }

    public ArrayList<String> ground_name() {
        ArrayList<String> list = new ArrayList<>();
        list.add("M. Chinnaswamy Stadium");
        list.add("Feroz Shah Kotla Ground");
        list.add("Rajiv Gandhi Intl. Cricket Stadium");
        list.add("Holkar Cricket Stadium");
        list.add("Sawai Mansingh Stadium");
        list.add("Eden Gardens");
        list.add("IS Bindra Stadium");
        list.add("Wankhede Stadium");
        list.add("Maharashtra Cricket Association's International Stadium");
        list.add("M. A. Chidambaram Stadium");

        return list;
    }

    public ArrayList<String> home_ground() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Royal Challengers Bangalore");
        list.add("Delhi Capitals");
        list.add("Sunrisers Hyderabad");
        list.add("Kings XI Punjab");
        list.add("Rajasthan Royals");
        list.add("Kolkata Knight Riders");
        list.add("Kings XI Punjab");
        list.add("Mumbai Indians");
        list.add("-");
        list.add("Chennai Super Kings");

        return list;
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }


}










