package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

//            입력할 새 닉네임이 뭔지 변수로 저장
            val inputNewNickName = newNicknameEdt.text.toString()


//            입력한 닉네임을 가지고 메인으로 복귀

//            입력닉네임을 담아주기 위한 용도로만 사용하는 intent
            val resultIntent = Intent()
            resultIntent.putExtra("nickname", inputNewNickName)
            setResult(RESULT_OK, resultIntent)
            finish()

        }
    }
}