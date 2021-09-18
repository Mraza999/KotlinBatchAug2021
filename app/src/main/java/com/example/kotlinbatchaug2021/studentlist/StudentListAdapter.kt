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
    class studentViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): studentViewHolder {
         var view=LayoutInflater.from(parent.context).inflate(R.layout.student_item_view,parent,false)
           return studentViewHolder(view)
    }

    override fun onBindViewHolder(holder: studentViewHolder, position: Int) {
       val student:Student=studentlist[position]
        holder.itemView.studentName.text=student.Name
        holder.itemView.department.text=student.Department
        holder.itemView.phoneNumber.text=student.PhoneNumber

    }

    override fun getItemCount(): Int {
        return studentlist.size
    }

    fun submitList(studentList: List<Student>) {
        studentlist=studentList
    }

}