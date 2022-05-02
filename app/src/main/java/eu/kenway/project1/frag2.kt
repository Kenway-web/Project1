package eu.kenway.project1


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get


class frag2 : Fragment() {


    private val viewModel:Communicator by activityViewModels()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val myView=LayoutInflater.from(container!!.context).inflate(R.layout.fragment_frag2,container,false)
        return myView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val txt=view.findViewById<View>(R.id.textView2) as TextView


        viewModel!!.message.observe(viewLifecycleOwner,Observer<Any> {

                txt.text = it.toString()

        })

    }

}