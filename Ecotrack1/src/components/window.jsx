import { useState, useEffect } from "react";


const Dashboard=()=>{
    const[width,setWidth]=useState(window.innerWidth);
    const[height,setHeight]=useState(window.outerHeight);

    useEffect(()=>{
        const handleResize=()=>{
            setWidth(window.innerWidth);
            setHeight(window.innerHeight);

        };
    },[]);
}