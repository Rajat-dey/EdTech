package com.example.edtech;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;


        import android.provider.ContactsContract;
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

        venueadapter customAdapter = new venueadapter(MainActivity.this, city(),seat(), ground_name(),home_ground(),start(),end(),mentorImage());
        mRecyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView
        customAdapter.notifyDataSetChanged();



        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        venueadapter2 customAdapter2 = new venueadapter2(MainActivity.this, views(),headline(), spokenBy());
        mRecyclerView.setAdapter(customAdapter2); // set the Adapter to RecyclerView
        customAdapter2.notifyDataSetChanged();



        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view3);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false);
        mRecyclerView.setLayoutManager(mLayoutManager);

        venueadapter3 customAdapter3 = new venueadapter3(MainActivity.this, city(),seat(), ground_name(),home_ground(),start(),end(),mentorImage());
        mRecyclerView.setAdapter(customAdapter3); // set the Adapter to RecyclerView
        customAdapter3.notifyDataSetChanged();






























    }

    public ArrayList<String> city() {
        ArrayList<String> list = new ArrayList<>();
        list.add("2K Likes");
        list.add("1.5K Likes");
        list.add("3K Likes");
        list.add("5K Likes");
        list.add("1K Likes");


        return list;
    }

    public ArrayList<String> seat() {
        ArrayList<String> list = new ArrayList<>();
        list.add("6 more slots");
        list.add("8 more slots");
        list.add("4 more slots");
        list.add("3 more slots");
        list.add("7 more slots");

        return list;
    }

    public ArrayList<String> ground_name() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Abhinav Chhikara");
        list.add("King Siddarth");
        list.add("Chethan KVS");
        list.add("Abhinav Chhikara");
        list.add("Rajat");
        return list;
    }

    public ArrayList<String> start() {
        ArrayList<String> list = new ArrayList<>();
        list.add("12:00 PM");
        list.add("2:00 PM");
        list.add("2:00 PM");
        list.add("3:00 PM");
        list.add("7:00 PM");


        return list;
    }

    public ArrayList<String> home_ground() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Founder of 10k Designers");
        list.add("Product Designer at Headout");
        list.add("Product Designer at Unacademy");
        list.add("Product Designer at Headout");
        list.add("Building something new");
        return list;
    }

    public ArrayList<String> end() {
        ArrayList<String> list = new ArrayList<>();
        list.add("2:00 PM");
        list.add("4:00 PM");
        list.add("4:00 PM");
        list.add("5:00 PM");
        list.add("9:00 PM");


        return list;
    }
    public ArrayList<Integer> mentorImage() {
        ArrayList<Integer> list = new ArrayList<>();


        return list;
    }


    public ArrayList<String> views() {
        ArrayList<String> list = new ArrayList<>();
        list.add("200K Views");
        list.add("100K Views");
        list.add("300K Views");
        list.add("400K Views");
        list.add("700K Views");


        return list;
    }



    public ArrayList<String> headline() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Why UX is important for any Product");
        list.add("Future of Interaction Design in Digital Era");
        list.add("The whole world is full of competition");
        list.add("Love is beautiful as AI");
        list.add("Human VS AI - Who Wins");



        return list;
    }


    public ArrayList<String> spokenBy() {
        ArrayList<String> list = new ArrayList<>();
        list.add("by Steven Cruce");
        list.add("by James Gun");
        list.add("by Someone");
        list.add("by Rajat Dey");
        list.add("by Indian's Genius");


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










