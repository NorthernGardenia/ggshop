
var ggshop = {
    //点击左侧导航树上的节点，添加选项卡
    registerMenuEvent:function(){
        //约定大于配置：jquery对象前面加上$,如果是DOM对象不需要加$
        var $tree = $('#menu .easyui-tree');
        $tree.tree({
            onClick:function(node){
                var href = node.attributes.href;//item-add
                var text = node.text;
                $('#tab').tabs('add',{
                    title: text,
                    href: href,
                    closable:true
                });
            }
        });
    },

    //添加选项卡
    addTabs: function (title,href) {
        if ($('#tab').tabs('exists', title)) {
            $('#tab').tabs('select', title);
        } else {
            $('#tab').tabs('add', {
                title: title,
                href: href,
                closable: true
            });


        }
    },
    closeTabs:function (title) {
        $('#tab').tabs('close',title);
    }

};



