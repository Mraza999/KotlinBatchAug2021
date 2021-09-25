package com.example.kotlinbatchaug2021.studentlist

import com.example.kotlinbatchaug2021.Model.Student

interface StudentClickListener {
    fun OnClick(student:Student)
    fun OnDelete(student: Student)

}