package jakubweg.mobishit.fragment;



//class HomeworkFragment : Fragment(){
//    companion object {
//        fun newInstance() = HomeworkFragment()
//        }
//
//        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        return inflater.inflate(
//        (if (MobiregPreferences.get(context ?: return null).allowedInstantNotifications)
//        R.layout.fragment_tests
//        else R.layout.fragment_tests_no_permission), container, false)
//        }
//
//
//
//
//        view.findViewById<View>(R.id.btnInfo)?.setOnClickListener {
//        AlertDialog.Builder(context ?: return@setOnClickListener)
//        .setTitle("Jak to działa?")
//        .setMessage(
//        "Mobireg nie wysyła sprawdzianów podczas synchronizacji, dlatego nie możemy i od tak wyświetlić.\n" +
//        "Stworzyliśmy jednak specjalny serwer, który zaloguje się na Twoje konto, pobierze sprawdziany i wyśle je Tobie.\n" +
//        "Wszystkie dane są przesyłane bezpiecznym, szyfrowanym połączeniem.")
//        .setPositiveButton("Rozumiem", null)
//        .show()
//        }
//        loadingLayout?.setOnRefreshListener {
//        startRefreshingRunnable.run()
//        model.refreshDataFromInternet()
//        }
//
//        val mgr = LinearLayoutManager(context!!)
//        testsList?.layoutManager = mgr
//        testsList?.addItemDecoration(DividerItemDecoration(context!!, mgr.orientation))
//
//        model.tests.observe(this, TestsObserver(this))
//        model.status.observe(this, StatusObserver(this))
//        }
//
//
//
//
//
//
//
//
//
//
//        }
