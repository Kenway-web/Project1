package eu.kenway.project1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

import androidx.lifecycle.ViewModelProviders


class frag1 : Fragment(R.layout.fragment_frag1) {




    private var model: Communicator?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view=inflater.inflate(R.layout.fragment_frag1,container,false)

        return  view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn=view.findViewById<View>(R.id.btn) as Button
        val username=view.findViewById<View>(R.id.username) as EditText
        val password=view.findViewById<View>(R.id.password) as EditText

        model= ViewModelProviders.of(requireActivity()).get(Communicator::class.java)
       btn.setOnClickListener {

           if(username.text.isEmpty()||password.text.isEmpty()||username.text.isEmpty()&&password.text.isEmpty())
           {
               Toast.makeText(context,"Kindly Fill All Credentials",Toast.LENGTH_LONG).show()
           }
           else
           {
               model!!.setMsgCommunicator(username.text.toString())
               requireActivity().supportFragmentManager.beginTransaction().replace(R.id.fragemnet,frag2()).commit()
           }

       }



    }



}





