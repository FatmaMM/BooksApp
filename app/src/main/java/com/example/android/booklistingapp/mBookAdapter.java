package com.example.android.booklistingapp;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class mBookAdapter extends ArrayAdapter<Book> {

    @BindView(R.id.cover) ImageView imageView;
    @BindView(R.id.title) TextView title;
    @BindView(R.id.author) TextView author;
    @BindView(R.id.date) TextView publishedDate;
    @BindView(R.id.webReaderLink) TextView webReaderLink;

    public mBookAdapter(@NonNull Context context, @NonNull List<Book> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listViewItem = convertView;
        if (listViewItem == null) {
            listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.book, parent, false);
        }
        ButterKnife.bind(this,listViewItem);
        final Book book = getItem(position);
        author.setText(book.getAuthor().toString());
        title.setText(book.getTitle().toString());
        Picasso.with(getContext()).load(Uri.parse(book.getImage())).error(R.drawable.no_book_cover).into(imageView);
        publishedDate.setText(book.getPublishedDate().toString());
        webReaderLink.setText(book.getWebReaderLink().toString());

        return listViewItem;
    }
}
