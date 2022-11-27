package ok.demo.twofragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


class FirstFragment : Fragment() {


    private lateinit var btn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val infVal = inflater.inflate(R.layout.fragment_first, container, false)

        val frm = SecondFragment()


        btn = infVal.findViewById<Button>(R.id.btnShoSecondFrag)
        btn.setOnClickListener {
            val transaction: FragmentTransaction =  requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.placeHolder, frm).commitNow()

        }
        return infVal
    }

    companion object {

        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}