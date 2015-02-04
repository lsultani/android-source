package io.bloc.android.blocly.ui.adapter;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import io.bloc.android.blocly.R;
import io.bloc.android.blocly.api.model.RssFeed;
import io.bloc.android.blocly.api.model.RssItem;

class ItemAdapterViewHolder extends RecyclerView.ViewHolder implements ImageLoadingListener, View.OnClickListener {


    TextView title;
    TextView feed;
    TextView content;
    View headerWrapper;
    ImageView headerImage;
    // #6
    String imageURL;
    RssItem rssItem;

    public ItemAdapterViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.tv_rss_item_title);
        feed = (TextView) itemView.findViewById(R.id.tv_rss_item_feed_title);
        content = (TextView) itemView.findViewById(R.id.tv_rss_item_content);

        headerWrapper = itemView.findViewById(R.id.fl_rss_item_image_header);
        headerImage = (ImageView) headerWrapper.findViewById(R.id.iv_rss_item_image);

        itemView.setOnClickListener(this);
    }

    void update(RssFeed rssFeed, RssItem rssItem) {
        this.rssItem = rssItem;
        feed.setText(rssFeed.getTitle());
        title.setText(rssItem.getTitle());
        content.setText(rssItem.getDescription());
       // imageURL = rssItem.getImageUrl();
       // Log.d("ItemAdapterViewHolder", "ImageURL = " + imageURL + " and rss image = " + rssItem.getImageUrl());
       // if (imageURL != null) {
        if(rssItem.getImageUrl() != null) {
            headerWrapper.setVisibility(View.VISIBLE);
            headerImage.setVisibility(View.INVISIBLE);

            //ImageLoader.getInstance().loadImage(imageURL, this);
            ImageLoader.getInstance().loadImage(rssItem.getImageUrl(), this);
        } else {
            headerWrapper.setVisibility(View.GONE);
        }
    }

    @Override
    public void onLoadingStarted(String imageUri, View view) {}

    @Override
    public void onLoadingFailed(String imageUri, View view, FailReason failReason) {}

    @Override
    public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
        //if (imageUri.equals(imageURL)) {
        if (imageUri.equals(rssItem.getImageUrl())) {
            headerImage.setImageBitmap(loadedImage);
            headerImage.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onLoadingCancelled(String imageUri, View view) {
        // Attempt a retry
        ImageLoader.getInstance().loadImage(imageUri, this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), rssItem.getTitle(), Toast.LENGTH_SHORT).show();
    }
}
