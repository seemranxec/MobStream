package md5aa8810330c008799dcaa6de0a580e2f3;


public class activity_stream_loading
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("WebView.Droid.activity_stream_loading, WebView.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", activity_stream_loading.class, __md_methods);
	}


	public activity_stream_loading ()
	{
		super ();
		if (getClass () == activity_stream_loading.class)
			mono.android.TypeManager.Activate ("WebView.Droid.activity_stream_loading, WebView.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}