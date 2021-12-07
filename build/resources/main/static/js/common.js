
/**
 * 页面加载loading
 * @param self
 */
function loading(self) {
    self.loading = true;
}

/**
 * 解除页面loading
 * @param self
 */
function unloading(self) {
    self.loading = false;
}

/**
 * 数据加载成功提醒
 * @param msg
 * @param self
 */
function success(msg,self) {
    self.$message.success({
        duration:500,
        showClose: true,
        message:msg});
}

/**
 * 数据加载失败提醒
 * @param msg
 * @param self
 */
function fail(msg,self) {
    self.$message.error({
        duration:500,
        showClose: true,
        message:msg});
}

function fail(msg,self,time) {
    if (!time) {
        time=500;
    }
    self.$message.error({
        duration:time,
        showClose: true,
        message:msg});
}

function isEmpty (val) {
    // null or undefined
    if (val == null) return true;

    if (typeof val === 'boolean') return false;

    if (typeof val === 'number') return !val;

    if (val instanceof Error) return val.message === '';

    switch (Object.prototype.toString.call(val)) {
        // String or Array
        case '[object String]':
        case '[object Array]':
            return !val.length;

        // Map or Set or File
        case '[object File]':
        case '[object Map]':
        case '[object Set]': {
            return !val.size;
        }
        // Plain Object
        case '[object Object]': {
            return !Object.keys(val).length;
        }
    }

    return false;
}

Vue.filter("FormatDate", function (date, fmt) {
    return formatDate(date, fmt);
});

function formatDate(date, fmt) {
    if (!date) {
        return "";
    }
    date = new Date(date);
    if (typeof (fmt) === "undefined") {
        fmt = "yyyy-MM-dd HH:mm:ss";
    }
    if (/(y+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, (date.getFullYear() + '').substr(4 - RegExp.$1.length))
    }
    let o = {
        'M+': date.getMonth() + 1,
        'd+': date.getDate(),
        'H+': date.getHours(),
        'm+': date.getMinutes(),
        's+': date.getSeconds()
    }
    for (let k in o) {
        if (new RegExp(`(${k})`).test(fmt)) {
            let str = o[k] + ''
            fmt = fmt.replace(RegExp.$1, RegExp.$1.length === 1 ? str : ('00' + str).substr(str.length));
        }
    }
    return fmt
};

/**
 * 关闭当前窗口
 */
function close() {
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
}

/**
 * 关闭当前窗口
 */
function closeAndConfirm() {
    if (true) {
        layer.confirm("是否关闭当前窗口？", {}, function (indexx) {
            close();
            return false;
        }, function (indexx) {
            layer.close(indexx)
            return false;
        })
        return false;
    }
}/**
 * 关闭当前窗口
 */
function closeAndFlushTable() {
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.close(index);
    try {
        parent.app.flushPage();
    } catch (e){

    }
}

/**
 * 关闭当前窗口
 */
function closeAndConfirmAndFlushTable() {
    if (true) {
        layer.confirm("是否关闭当前窗口？", {}, function (indexx) {
            close();
            parent.app.flushPage();
            return false;
        }, function (indexx) {
            layer.close(indexx)
            return false;
        })
        return false;
    }
}


/**
 * 打开弹窗
 * 不需要确认关闭
 * @param url
 * @param width
 * @param height
 * @param title
 */
function open(url, width, height, title) {
    layui.use('layer', function () {
        var layer = layui.layer;
        layer.open({
            type: 2,
            title: title,
            area: [width, height],
            content: url,
        })
    });
}

/**
 * 打开弹窗并且设置确认窗口
 * @param url
 * @param width
 * @param height
 * @param title
 * @param self
 */
function openAndConfirm(url, width, height, title, self) {
    var self = this;
    layui.use('layer', function () {
        var layer = layui.layer;
        var index = layer.open({
            type: 2,
            title: title,
            area: [width, height],
            content: url,
            cancel: function (indexx, layero) {
                if (true) {
                    layer.confirm("是否关闭当前窗口？", {}, function (indexx) {
                        layer.close(index)
                        layer.close(indexx);
                        parent.app.flushPage();
                        return false;
                    }, function (indexx) {
                        layer.close(indexx)
                        return false;
                    })
                    return false;
                }
            }
        })
    });
}

function getUrlParam(data) {
    return decodeURIComponent((new RegExp('[?|&]' + data + '=' + '([^&;]+?)(&|#|;|$)').exec(location.href) || [, ""])[1].replace(/\+/g, '%20')) || null;
}

function download(href, name) {
    let eleLink = document.createElement('a')
    eleLink.download = name
    eleLink.href = href
    eleLink.click()
    eleLink.remove()
}

function myIsNaN(value) {
    return typeof value === 'number' && !isNaN(value);
}