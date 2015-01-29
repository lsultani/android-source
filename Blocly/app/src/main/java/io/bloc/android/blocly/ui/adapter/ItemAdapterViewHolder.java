package io.bloc.android.blocly.ui.adapter;

import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;

import io.bloc.android.blocly.R;
import io.bloc.android.blocly.api.model.RssFeed;
import io.bloc.android.blocly.api.model.RssItem;

class ItemAdapterViewHolder extends RecyclerView.ViewHolder implements ImageLoadingListener {


    TextView title;
    TextView feed;
    TextView content;
    View headerWrapper;
    ImageView headerImage;
    // #6
    String imageURL;

    public ItemAdapterViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.tv_rss_item_title);
        feed = (TextView) itemView.findViewById(R.id.tv_rss_item_feed_title);
        content = (TextView) itemView.findViewById(R.id.tv_rss_item_content);
// #7
        headerWrapper = itemView.findViewById(R.id.fl_rss_item_image_header);
        headerImage = (ImageView) headerWrapper.findViewById(R.id.iv_rss_item_image);
    }

    void update(RssFeed rssFeed, RssItem rssItem) {
        feed.setText(rssFeed.getTitle());
        title.setText(rssItem.getTitle());
        content.setText(rssItem.getDescription());
        imageURL = rssItem.getImageUrl();
        Log.d("ItemAdapterViewHolder", "ImageURL = " + imageURL + " and rss image = " + rssItem.getImageUrl());
        if (imageURL != null) {
// #8
            headerWrapper.setVisibility(View.VISIBLE);
            headerImage.setVisibility(View.INVISIBLE);
            ImageLoader.getInstance().loadImage(imageURL, this);
        } else {
// #9
            headerWrapper.setVisibility(View.GONE);
        }
    }

    @Override
    public void onLoadingStarted(String imageUri, View view) {}

    @Override
    public void onLoadingFailed(String imageUri, View view, FailReason failReason) {}

    @Override
    public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
// #10
        if (imageUri.equals(imageURL)) {
            headerImage.setImageBitmap(loadedImage);
            headerImage.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onLoadingCancelled(String imageUri, View view) {
        // Attempt a retry
        ImageLoader.getInstance().loadImage(imageUri, this);
    }
}
