package com.gitandgithub;

public class all {}
    //pwd -->Print Working Directory
    //cd --> to inside the folder
    //mkdir --> to make a project
    // rm -r foldername --> to remove folder recursively
    //rm -rf foldername --> remove folder forcefully without any ques
    //ls --> to see all files in folder
    //ls -a --> is ls not working means there might be possibility of hidden files . thats why we use it

    //git init --> we cannot directly see git .thats we use it
    //ls .git --> to see files in git
    //touch (file_name with .txt)--> to make new file in git --> no one knows it exist --> we can verified using command git status
    //git status --> tell us about these are changes that no one knows about that

    //git add f(ile_name with .txt)--> to maintain these changes
    // git add . --> if we use . dot just after add then it will add all uncommit files
    //git commit -m "(file_name with .txt)  file added" --> after adding we want to commit it

    //vi (file_name with .txt) --> to add something in the file
    // cat (file_name with .txt)--> display what is inside that file

    //git restore --staged (file_name with .txt)--> if want to uncommit or remove from github
    //git log --> all history of commit and uncommit can be seen

    //git reset <commit-id>
    //-->✅ Removes commits after that
    //-->✅ Keeps your file changes (but unstaged)

    //git reset --soft <commit-id>
    //-->✅ Removes commits
    //-->✅ Keeps changes + still staged

    //git reset --hard <commit-id>
    //-->❌ Deletes commits
    //-->❌ Deletes all changes permanently

    //git stash -->“Put my current work aside, I’ll come back later-->is used to temporarily save your changes and clean your working directory
    //git stash pop  -->  // bring them back
    //git stash clear --> //Delete all saved work

    //git remote add origin (url of repository)--> here remote means working with url ,add means going to add ,origin means what is name of url that we are going to add
    //git remote -v --> Tumhare Git repository ke remote connections ko dekhna (with URLs)
                      // Check karne ke liye ki repo sahi GitHub se linked hai ya nahi
                      //URL galat ho toh fix karne ke liye

     //git push origin main -->git push → code ko upload/send karna
                              //origin → remote ka naam (usually GitHub repo ka default naam)
                              //main → branch ka naam (jahan tum code bhejna chahte ho)

     //git clone (url) --> Kisi remote repository (GitHub) ka poora project apne computer me copy karna
     //origin → tumhara khud ka repo (fork ya apna project ).upstream → original repo jahan se tumne fork kiya
     //git remote add upstream <repository-URL> --> "Original repo ko bhi connect kar do taaki updates le saku baad me when needed "
     //HEAD -->  Tum abhi kis branch / commit par kaam kar rahe ho"
     //git branch → branches dekho / banao
     //git checkout → branch change ka

///for every pull request we need to make new branch
//1. 🛡️ Safe main branch-->main clean aur working rehta hai,Tum experiments safely kar sakti ho
//2. Easy review (Pull Request) --> Sirf tumhare changes dikhenge,Reviewer easily check karega

//git reset = undo (peeche jaana)
            //commits undo kar sakta hai
            //staging area clean kar sakta hai
            //changes hata bhi sakta hai

//git push origin main --> Jab tum history change kar dete ho, tab normal push kaam nahi karta,Tab use hota hai force push
//git fetch --all --prune --> Updates lata hai + clean karta hai
//git reset --hard upstream/main --> Tum apni current branch ko exactly same bana rahe ho jo upstream/main hai
//git pull upstream main --> Upstream se changes laata hai,Tumhare existing code ke saath merge karta hai,Tumhare commits safe rehte hain ✅
