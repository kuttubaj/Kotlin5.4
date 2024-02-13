import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.kotlin54.databinding.FragmentBrawlStarsBinding
import com.example.kotlin54.ui.actitvity.BrawlStarsViewModel
import com.example.kotlin54.ui.adapters.BrawlStarsAdapter

class BrawlStarsFragment : Fragment() {

    private var _binding: FragmentBrawlStarsBinding? = null
    private val binding: FragmentBrawlStarsBinding get() = _binding!!
    private val adapter = BrawlStarsAdapter()
    private val viewModel by viewModels<BrawlStarsViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBrawlStarsBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribe()
        initialize()
    }

    private fun subscribe() {
        viewModel.brawlStarsCharacterLiveData.observe(viewLifecycleOwner) {
            Log.e("brawl321 ", "subscribe: ${it.success}")
            adapter.setListItem(it.success!!)
        }
    }

    private fun initialize() = with(binding) {
        rvMain.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
