package se.magictechnology.pia9nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val gootherbtn = view.findViewById<Button>(R.id.goOtherBtn)

        gootherbtn.setOnClickListener {
            //findNavController().navigate(R.id.action_startFragment_to_otherFragment)

            val goOther = StartFragmentDirections.actionStartFragmentToOtherFragment("Banan", 7)

            findNavController().navigate(goOther)

        }
    }

}