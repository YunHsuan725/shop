import axiosapi from 'axios';

const request = axiosapi.create({
    baseURL: '/data',
    timeout: 5000,
    headers: {
        "Content-Type" : "application/json;charset=utf-8",
    }
})

request.interceptors.request.use(config => {
    return config
}, error => {
    return Promise.reject(error)
})

request.interceptors.response.use(response => {
    let res = response.data;

    if(typeof res === 'string'){
        res = res ? JSON.parse(res) : res
    }
    return res
}, error => {
    console.log('err' + error);
    return Promise.reject(error)
})

export default request