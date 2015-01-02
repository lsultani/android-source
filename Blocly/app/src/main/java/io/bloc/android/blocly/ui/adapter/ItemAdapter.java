package io.bloc.android.blocly.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.bloc.android.blocly.BloclyApplication;
import io.bloc.android.blocly.R;
import io.bloc.android.blocly.api.DataSource;
import io.bloc.android.blocly.api.model.RssFeed;
import io.bloc.android.blocly.api.model.RssItem;

/**
 * Created by lesliesultani on 1/1/15.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemAdapterViewHolder> {

    // #6 a required method which asks us to create and return a ViewHolder, specifically one matching
    // the class we supplied as our typed-parameter, ItemAdapterViewHolder. To create the View from XML,
    // we use the LayoutInflater class which is capable of converting XML layouts into displayable,
    // programmatic View objects.
    @Override
    public ItemAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int index) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rss_item, viewGroup, false);
        return new ItemAdapterViewHolder(inflate);
    }

    // #7 we implement another required Adapter method. A bind action is requested when an index needs
    // its data mapped to a given ViewHolder. As the user scrolls down, they scroll to higher indexes.
    // They begin at the top with 0 and may scroll as far down as the number provided at #8 less one,
    // which is 9 in our case.
    @Override
    public void onBindViewHolder(ItemAdapterViewHolder itemAdapterViewHolder, int index) {
        DataSource sharedDataSource = BloclyApplication.getSharedDataSource();
        itemAdapterViewHolder.update(sharedDataSource.getFeeds().get(0), sharedDataSource.getItems().get(index));
    }

    // #8
    @Override
    public int getItemCount() {
        return BloclyApplication.getSharedDataSource().getItems().size();
    }

    // #9 where we've created an inner-class named ItemAdapterViewHolder. A ViewHolder is responsible for
    // maintaining control of a single cell in the list. As the user scrolls, a single ViewHolder may be
    // reused to represent several items in the list. As you scroll an item's View off screen, it is refreshed
    // and re-inserted at the bottom of the screen, recycling indeed.
    class ItemAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView feed;
        TextView content;

        public ItemAdapterViewHolder(View itemView) {
            super(itemView);
// #10 itemView is a reference to an inflated version of rss_item.xml, therefore it is the parent of all three TextViews we established earlier in our XML layout. We take this moment to find them by searching for Views associated with their resource identifiers – generated earlier using android:id="@+id/tv_…". We need references to these Views such that we can programmatically change their text during the update(…) method.
            title = (TextView) itemView.findViewById(R.id.tv_rss_item_title);
            feed = (TextView) itemView.findViewById(R.id.tv_rss_item_feed_title);
            content = (TextView) itemView.findViewById(R.id.tv_rss_item_content);
        }

        void update(RssFeed rssFeed, RssItem rssItem) {
            feed.setText(rssFeed.getTitle());
            title.setText(rssItem.getTitle());
            content.setText(rssItem.getDescription());
        }
    }

}
