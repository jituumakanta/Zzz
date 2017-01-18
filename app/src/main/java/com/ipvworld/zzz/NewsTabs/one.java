package com.ipvworld.zzz.NewsTabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.ipvworld.zzz.Adapter.CardAdapter1;
import com.ipvworld.zzz.LayoutDesign.DividerItemDecoration;
import com.ipvworld.zzz.BeanClass.ListItem;
import com.ipvworld.zzz.Main.MySingleton;
import com.ipvworld.zzz.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class one extends Fragment {

    RecyclerView recyclerView0;
    RecyclerView.LayoutManager layoutManager0;
    RecyclerView.Adapter adapter0;
    List<ListItem> listTrndingNewsData0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity(), "one", Toast.LENGTH_LONG).show();
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        recyclerView0 = (RecyclerView) view.findViewById(R.id.recyclerView1);
        recyclerView0.setHasFixedSize(true);

        layoutManager0 = new LinearLayoutManager(getActivity());
        recyclerView0.setLayoutManager(layoutManager0);
        recyclerView0.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));

        listTrndingNewsData0 = new ArrayList<>();
        getTrndingNews0();
        return view;

    }

    public void getTrndingNews0() {
        //uploading = ProgressDialog.show(getActivity(), "Loading", "Please wait...", false, false);
        String url5 = "https://newsapi.org/v1/articles?source=associated-press&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest5 = new JsonObjectRequest(Request.Method.GET, url5, null, new Response.Listener<JSONObject>() {
            JSONObject o;

            @Override
            public void onResponse(JSONObject response) {
                o = response;
                praseJsonNewsData0(o);
                // Toast.makeText(getApplicationContext(),""+o,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }
        });
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest5);

        String url1 = "https://newsapi.org/v1/articles?source=abc-news-au&sortBy=top&apiKey=    41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest1 = new JsonObjectRequest(Request.Method.GET, url1, null, new Response.Listener<JSONObject>() {
            JSONObject o;

            @Override
            public void onResponse(JSONObject response) {
                o = response;
                praseJsonNewsData0(o);

                // Toast.makeText(getApplicationContext(),""+o,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }
        });
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest1);

        String url3 = "https://newsapi.org/v1/articles?source=engadget&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest3 = new JsonObjectRequest(Request.Method.GET, url3, null, new Response.Listener<JSONObject>() {
            JSONObject o;

            @Override
            public void onResponse(JSONObject response) {
                o = response;
                praseJsonNewsData0(o);

                // Toast.makeText(getApplicationContext(),""+o,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }
        });
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest3);

        String url4 = "https://newsapi.org/v1/articles?source=entertainment-weekly&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest4 = new JsonObjectRequest(Request.Method.GET, url4, null, new Response.Listener<JSONObject>() {
            JSONObject o;

            @Override
            public void onResponse(JSONObject response) {
                o = response;
                praseJsonNewsData0(o);

                // Toast.makeText(getApplicationContext(),""+o,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }
        });
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest4);

        String url6 = "https://newsapi.org/v1/articles?source=google-news&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest6 = new JsonObjectRequest(Request.Method.GET, url6, null, new Response.Listener<JSONObject>() {
            JSONObject o;

            @Override
            public void onResponse(JSONObject response) {
                o = response;
                praseJsonNewsData0(o);

                // Toast.makeText(getApplicationContext(),""+o,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }
        });
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest6);

        String url7 = "https://newsapi.org/v1/articles?source=reuters&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest7 = new JsonObjectRequest(Request.Method.GET, url7, null, new Response.Listener<JSONObject>() {
            JSONObject o;

            @Override
            public void onResponse(JSONObject response) {
                o = response;
                praseJsonNewsData0(o);

                // Toast.makeText(getApplicationContext(),""+o,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }
        });
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest7);

        String url8 = "https://newsapi.org/v1/articles?source=the-hindu&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest8 = new JsonObjectRequest(Request.Method.GET, url8, null, new Response.Listener<JSONObject>() {
            JSONObject o;

            @Override
            public void onResponse(JSONObject response) {
                o = response;
                praseJsonNewsData0(o);

                // Toast.makeText(getApplicationContext(),""+o,Toast.LENGTH_LONG).show();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                // TODO Auto-generated method stub

            }
        });
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest8);
    }

    public void praseJsonNewsData0(JSONObject o) {
        JSONObject jj = o;
        JSONArray rr;
        JSONObject jjj;
        ListItem lt3;

        try {
            String statuss = jj.getString("status");
            String sourcee = jj.getString("source");
            String sortBy = jj.getString("sortBy");
            // converting object to array
            rr = jj.getJSONArray("articles");

            for (int i = 0; i < rr.length(); i++) {
                lt3 = new ListItem();
                jjj = rr.getJSONObject(i);
                String authorr = jjj.getString("author");
                String titlee = jjj.getString("title");
                String descriptionn = jjj.getString("description");
                String urll = jjj.getString("url");
                String urlToImagee = jjj.getString("urlToImage");
                String publishedAtt = jjj.getString("publishedAt");

                lt3.setAuthor(authorr);
                lt3.setTitle(titlee);
                lt3.setDescription(descriptionn);
                lt3.setUral(urll);
                lt3.seturlToImage(urlToImagee);
                lt3.setpPublishedAt(publishedAtt);
                lt3.setSouce(sourcee);
                listTrndingNewsData0.add(lt3);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        adapter0 = new CardAdapter1(listTrndingNewsData0, getActivity());
        recyclerView0.setAdapter(adapter0);
        //uploading.dismiss();
    }

}
