package com.example.kotlinbatchaug2021.studentlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinbatchaug2021.Model.Student
import com.example.kotlinbatchaug2021.R
import kotlinx.android.synthetic.main.student_item_view.view.*


class StudentListAdapter: RecyclerView.Adapter<StudentListAdapter.studentViewHolder>() {

   var studentlist:List<Student> = listOf()
    //class for viewholder
    class studentViewHolder(view: View): RecyclerView.ViewHolder(view)

    //function to create view holder
    //viewholder is list item design/holder which will hold data for evry list item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): studentViewHolder {

        //inflating list item design/xml
         val view=LayoutInflater.from(parent.context).inflate(R.layout.student_item_view,parent,false)

        //returning StudentViewholder class with view
           return studentViewHolder(view)
    }


    //function to bind holder and list items with each other
    override fun onBindViewHolder(holder: studentViewHolder, position: Int) {

        //variable to hold one item of list
       val student:Student=studentlist[position]

        holder.itemView.studentName.text=student.Name
        holder.itemView.department.text=student.Department
        holder.itemView.phoneNumber.text=student.PhoneNumber

    }

    //function returning count in list items
    override fun getItemCount(): Int {
        //returning size/count of list (size is function of list)
        return studentlist.size
    }

    //function to get list from activity
    fun submitList(studentList: List<Student>) {
        //list which we get from activity assigned to variable
        studentlist=studentList
    }

}