# Gimana cara penggunaannya?

1. pada build.gradle (Module) ketikkan kode berikut:
```gradle
android{
 ...
 buildFeatures{
    viewBinding true
 }
}
```
<br>
2. Pada activity, penggunaannya sebagai berikut:

```kotlin
...
lateinit var binding: FragmentMainBinding
override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding = FragmentMainBinding.bind(view)
    binding.tvHelloWorld.text = "Yellow World!"

}
...
```
<br>
3. lalu penggunaannya pada sebuah fragment adalah sebagai berikut:

```kotlin
...
lateinit var binding: ActivityMainBinding
override fun onCreate(savedInstanceState: Bundle?) {
   super.onCreate(savedInstanceState)
   binding = ActivityMainBinding.inflate(layoutInflater)
   setContentView(binding.root)
   binding.tvHelloWorld.text = "Yellow world"
}
...
```
