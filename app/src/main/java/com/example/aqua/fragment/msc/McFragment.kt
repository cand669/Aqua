package com.example.aqua.fragment.kit
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.aqua.adapter.SmartAdapter
import com.example.aqua.databinding.FragmentMBinding


class McFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentMBinding.inflate(inflater, container, false)
        val recyclerView = binding.recyclerView
        val manager = LinearLayoutManager(this.requireContext())
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager
        val adapter = SmartAdapter<String>()
        recyclerView.adapter = adapter
        val refreshLayout = binding.refreshLayout
        refreshLayout.setEnableAutoLoadMore(true);
        refreshLayout.setOnRefreshListener {
            it.layout.postDelayed({
                Log.i("FAW","Refresh")
                adapter.refresh(listOf("1","2","3"))
                it.finishRefresh()
                it.resetNoMoreData()
            },0)
        }
        refreshLayout.setOnLoadMoreListener {
            it.layout.postDelayed({
                Log.i("FAW","LoadMore")
                adapter.loadMore(listOf("1","2","3"))
                it.finishLoadMoreWithNoMoreData();
                it.finishLoadMore();
            },0)
        }
        refreshLayout.autoRefresh();
        return binding.root
    }

}