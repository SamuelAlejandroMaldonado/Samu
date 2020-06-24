
<h2>Libreria Onboarding</h2>

<h3>Instalación<h3> <br>
<p>Agréguelo a su raíz build.gradle al final de los repositorios:</p>
	<br>
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}


<br>
<p>Agregar la dependencia:</p>
<br>
dependencies {
	        implementation 'com.github.SamuelAlejandroMaldonado:Samu:1'
	}
  
  
  <br>
  <p>Dentro el main en el nuevo proyecto</p><br>
  
  public class MainActivity extends AppCompatActivity {
    private ViewPager viewPagerContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _initializeComponents();


        _initializeFragmentAdapter();
    }

    public void _initializeComponents() {
        viewPagerContainer = findViewById(com.sam.mylibraryon.R.id.viewPagerContainer);
    }

    public void _initializeFragmentAdapter() {
        OnboardingAdapter adapter = new OnboardingAdapter(getSupportFragmentManager());
        viewPagerContainer.setAdapter(adapter);
    }

}

<p>Dentro del archivo xml del main activity</p>

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <androidx.viewpager.widget.ViewPager
        android:id="@+id/viewPagerContainer"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    </androidx.viewpager.widget.ViewPager>

</LinearLayout>
