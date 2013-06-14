XCodeBuildJob
=============

What is it
----------
Jenkins Plug-in.
XCodeでビルドする目的で、FreeStyleProject と同等のジョブを提供します。

How To Use
----------
 * 「新規ジョブ作成」で「XCodeBuildJob」を選択する
 * ジョブ設定の「ビルド手順の追加」で「XCodeビルダー」を選択する **(TODO)**
 * ジョブ実行時に「Target」「Configuration」「Schema」を選択できる **(TODO)**  
   選択肢は、xcodeprojファイルから読み込まれる **(TODO)**
 * ビルドスクリプト内では、以下のシェル変数を使用できる **(TODO)**
  * XCODEPROJ\_BUILD\_TARGET
  * XCODEPROJ\_BUILD\_CONFIGURATION
  * XCODEPROJ\_BUILD\_SCHEMA

ToDo
----
 * Builder継承クラス作成
 * プロジェクトファイルパーサ作成
 * 選択肢をシェル変数に追加する機能
 * 選択肢のピン止め機能
