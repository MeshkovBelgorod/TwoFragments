package ok.demo.twofragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction


class SecondFragment : Fragment() {

    private lateinit var btn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val infVal = inflater.inflate(R.layout.fragment_second, container, false)

        val frm = FirstFragment()

        btn = infVal.findViewById<Button>(R.id.btnShowFirstFrag)
        btn.setOnClickListener {
            val transaction: FragmentTransaction =  requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.placeHolder, frm).commitNow()

        }
        return infVal
    }

    companion object {

        @JvmStatic
        fun newInstance() = SecondFragment()
    }
}