package com.manager.font.fontmanager

import android.graphics.Typeface
import android.widget.*


//<For Java>
class FontIconIGB{

    companion object {

        fun setTextEditFontAwesome_Edit_Text(edit:EditText): EditText{

            val context = edit.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            edit.setTypeface(typeface)

            return edit
        }

        fun setTextFontAwesome_Text_View(text: TextView): TextView{

            val context = text.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            text.setTypeface(typeface)

            return  text

        }

        fun setTextFontAwesome_Button(btn: Button): Button{

            val context = btn.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            btn.setTypeface(typeface)

            return btn
        }

        fun setTextSwitchFontAwesome_Switch(swt: Switch):Switch{

            val context = swt.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            swt.setTypeface(typeface)

            return swt

        }

        fun setTextCheckBoxFontAwesome_CheckBox(cb:CheckBox): CheckBox{

            val context = cb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            cb.setTypeface(typeface)

            return cb

        }

        fun setToggleButtonFontAwesome_ToggleButton(tgb:ToggleButton):ToggleButton{

            val context = tgb.context.applicationContext
            val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
            tgb.setTypeface(typeface)

            return tgb

        }

    }
}


//<For Kotlin>
fun EditText.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun TextView.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun Button.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun Switch.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun CheckBox.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}

fun ToggleButton.setTextFontAwesome(font: String){

    val context = this.context.applicationContext
    val typeface = Typeface.createFromAsset(context.assets, JGBFontManager.getFontAwesomeBrands())
    this.setTypeface(typeface)
    this.setText(font)

}





