package com.phis.orderpractice_20200610

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import com.phis.orderpractice_20200610.datas.Store
import kotlinx.android.synthetic.main.activity_pizza_store.*

class PizzaStoreActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza_store)

        setValues()
        setupEvents()

    }

    override fun setValues() {

        val store = intent.getSerializableExtra("store") as Store

        Glide.with(mContext)
            .load(store.imgUrl)
            .into(civImg)

        tvStoreName.text = store.name
        tvStorePhone.text = store.phoneNumber
        tvStoreWebsite.text = store.website


    }

    override fun setupEvents() {

        btnDial.setOnClickListener {

            val pl: PermissionListener = object : PermissionListener {
                override fun onPermissionGranted() {
                    val myUri = Uri.parse("tel:${tvStorePhone.text}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)
                }

                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
                    Toast.makeText(mContext, "권한이 거부되어 실패되었습니다.", Toast.LENGTH_SHORT).show()
                }

            }

            TedPermission.with(mContext).setPermissionListener(pl)
                .setDeniedMessage("권한을 거부하면 통화를 할 수 없습니다. [설정] > [권한]에서 설정을 해주세요")
                .setPermissions(android.Manifest.permission.CALL_PHONE).check()
        }

        btnOpenWeb.setOnClickListener {
            val myUri = Uri.parse("${tvStoreWebsite.text}")
            val myIntent = Intent(Intent.ACTION_VIEW, myUri)
            startActivity(myIntent)


        }


    }


}
