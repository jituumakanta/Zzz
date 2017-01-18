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
import com.ipvworld.zzz.Adapter.CardAdapter2;
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
public class World extends Fragment {

    RecyclerView recyclerView0;
    RecyclerView.LayoutManager layoutManager0;
    RecyclerView.Adapter adapter0;
    List<ListItem> listTrndingNewsData0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(getActivity(), "Trending", Toast.LENGTH_LONG).show();
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
        String url5 = "https://newsapi.org/v1/articles?source=ars-technica&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
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

        String url15 = "https://newsapi.org/v1/articles?source=time&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest15 = new JsonObjectRequest(Request.Method.GET, url15, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest15);


        String url7 = "https://newsapi.org/v1/articles?source=the-washington-post&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
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

        String url8 = "https://newsapi.org/v1/articles?source=the-wall-street-journal&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
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

        String url81 = "https://newsapi.org/v1/articles?source=the-guardian-au&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest81 = new JsonObjectRequest(Request.Method.GET, url81, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest81);

        String url82 = "https://newsapi.org/v1/articles?source=the-economist&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest82 = new JsonObjectRequest(Request.Method.GET, url82, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest82);

        String url83 = "https://newsapi.org/v1/articles?source=sky-news&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest83 = new JsonObjectRequest(Request.Method.GET, url83, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest83);

        String url84 = "https://newsapi.org/v1/articles?source=newsweek&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest84 = new JsonObjectRequest(Request.Method.GET, url84, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest84);

        String url842 = "https://newsapi.org/v1/articles?source=mirror&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest842 = new JsonObjectRequest(Request.Method.GET, url842, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest842);


        String url841 = "https://newsapi.org/v1/articles?source=metro&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest841 = new JsonObjectRequest(Request.Method.GET, url841, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest841);


        String url8411 = " https://newsapi.org/v1/articles?source=gruenderszene&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest8411 = new JsonObjectRequest(Request.Method.GET, url8411, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest8411);


        String url8414 = "https://newsapi.org/v1/articles?source=fortune&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest8414 = new JsonObjectRequest(Request.Method.GET, url8414, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest8414);


        String url84131 = "https://newsapi.org/v1/articles?source=financial-times&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest84131 = new JsonObjectRequest(Request.Method.GET, url84131, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest84131);


        String url8417 = "https://newsapi.org/v1/articles?source=daily-mail&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest8417 = new JsonObjectRequest(Request.Method.GET, url8417, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest8417);

        String url89 = "https://newsapi.org/v1/articles?source=cnbc&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest89 = new JsonObjectRequest(Request.Method.GET, url89, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest89);


        String url891 = "https://newsapi.org/v1/articles?source=bloomberg&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest891 = new JsonObjectRequest(Request.Method.GET, url891, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest891);


        String url8911 = " https://newsapi.org/v1/articles?source=bbc-news&sortBy=top&apiKey=41dbfb9f7c854533ab8ac78c91b664ed";
        JsonObjectRequest jsObjRequest8911 = new JsonObjectRequest(Request.Method.GET, url8911, null, new Response.Listener<JSONObject>() {
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
        MySingleton.getInstance(getActivity()).addToRequestQueue(jsObjRequest8911);


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
