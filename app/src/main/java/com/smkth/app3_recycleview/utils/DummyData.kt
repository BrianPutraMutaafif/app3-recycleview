package com.smkth.app3_recycleview.utils

import com.smkth.app3_recycleview.model.Student

object DummyData{
    fun getStudentList(): List<Student> {
        return listOf(
            Student("Andi", "123456", "XII TJKT 1"),
            Student("Okta", "123456", "XII TJKT 1"),
            Student("Soli", "123456", "XII TJKT 1"),
            Student("Brian", "19556", "XII TJKT 1"),
            Student("Putra", "19556", "XII TJKT 1"),
            Student("Muta'afif", "19556", "XII TJKT 1"),
            Student("Damasa", "19561", "XII TJKT 1"),
            Student("Shafa", "19561", "XII TJKT 1"),
            Student("Ariella", "19561", "XII TJKT 1"),
            Student("Rahayu", "19561", "XII TJKT 1"),
            Student("Kirana", "19600", "XII TJKT 1"),
            Student("Alifa", "19600", "XII TJKT 1"),
            Student("Ummah", "19600", "XII TJKT 1"),
        )
    }
}