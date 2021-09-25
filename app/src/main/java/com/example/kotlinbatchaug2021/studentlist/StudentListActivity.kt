package com.example.kotlinbatchaug2021.studentlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinbatchaug2021.Model.Student
import com.example.kotlinbatchaug2021.R
import kotlinx.android.synthetic.main.activity_student_list.*

class StudentListActivity : AppCompatActivity() , StudentClickListener {
    val studentadapter=StudentListAdapter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_list)

        //Submitting Student List to Adapter
        studentadapter.submitList(getStudentList())
        //Our Receycler view need 2 things from us (LayoutMangaer and Adapter
        studentListRecyclerView.apply{
            //LayoutManager (to specify list orientation is Vertical or horizantal)
            layoutManager=LinearLayoutManager(this@StudentListActivity,LinearLayoutManager.VERTICAL,false)
            //Adapter (adpater is used to hold and bind Item View with Data list)
            adapter=studentadapter
        }
    }

    //function to get StudentList
    private fun getStudentList(): List<Student> {

        //making List of Student Type

        val List= arrayListOf<Student>()
        List.add(Student("Ali","03456789","Computer Science"))
        List.add(Student("Raza","0345456789","Information Texh"))
        List.add(Student("Ahmed","034456789","Bio-texh"))
        List.add(Student("Nimra","03987689","finance"))
        List.add(Student("Sadia","23456789","English"))
        List.add(Student("MAha","03434567","Sociology"))
        List.add(Student("moazma","3456789","MAths"))
        List.add(Student("Awais","034534567","Urdu"))
        List.add(Student("USman","3456789","Coputer Engineering"))
        List.add(Student("Umer","04567567","Software Engineering"))
        List.add(Student("USama","234567569","Physics"))

        //returning our list
        return List
    }

    override fun OnClick(student: Student) {
        Toast.makeText(this,student.Name,Toast.LENGTH_LONG).show()
    }

    override fun OnDelete(student: Student) {

    }
}