package com.example.aqua
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.aqua.databinding.ActivityMainBinding
import com.example.aqua.fragment.kit.McFragment
import com.example.aqua.fragment.kit.MqFragment

class MainActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding?.aaa?.setOnClickListener(this)
        binding?.ccc?.setOnClickListener(this)




//        val mUserViewModel = ViewModelProvider(this).get(UserViewModel::class.java)
//        mUserViewModel.addUser(UserEntity(1,"2","33",5))
//        mUserViewModel.readAllData.value?.forEach {
//            Log.i("FAW",it.firstName)
//        }

    }
    val a =  McFragment()
    val m =  MqFragment()

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.aaa ->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment,a)
                    .commit()
            }
            R.id.ccc ->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment,m)
                    .commit()
            }
        }
    }

}
