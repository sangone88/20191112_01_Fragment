package com.tjoeun.a20191112_01_fragment.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.tjoeun.a20191112_01_fragment.fragment.FirstFragment
import com.tjoeun.a20191112_01_fragment.fragment.SecondFragment

class TestViewPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm) {

//    각 위치에 어떤 Fragment를 보여줄건지
    override fun getItem(position: Int): Fragment {
//      자바코드
//      if (position == 0) {
//          return FirstFragment()
//      }
//      else{
//          return SecondFragment()
//      }

//        코틀린코드
//    리턴의 결과를 선택할때 when을 사용
        return when(position) {
            0 -> {
                FirstFragment()
            }
            else -> {
                SecondFragment()
            }
        }

    }

//    몇개의 페이지를 운영할건지
    override fun getCount(): Int {
      return 2
    }
}