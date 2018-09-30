#新建远程分支
######$ git checkout -b newbranch
######$ git push origin newbranch
######$ git branch --set-upstream-to=origin/pretest
#git操作及fatal: Authentication failed for错误解决
##1、配置用户信息
######$ git config --global user.name [username]
######$ git config --global user.email [email]
##2、查询用户信息
######$ git config --list
##3、如果push遇到在输入密码是熟错后，就会报这个错误fatal: Authentication failed for
###解决办法：
######$ git config --system --unset credential.helper
====之后你在push就会提示输入名称和密码
####====免密码方式
######$ git config --global credential.helper store


##4、Git HEAD detached from XXX (git HEAD 游离) 解决办法
====查看当前领先多少 
######$ git branch -v 
====新建一个 temp 分支，把当前提交的代码放到整个分支 
######$ git branch temp
====checkout 出要回到的那个分支，这里是 dev 
######$ git checkout dev
====然后 merge 刚才创建的临时分支，把那些代码拿回来
######$ git merge temp