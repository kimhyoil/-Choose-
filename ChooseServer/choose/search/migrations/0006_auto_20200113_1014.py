# Generated by Django 3.0.2 on 2020-01-13 10:14

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('search', '0005_recentlookup_user'),
    ]

    operations = [
        migrations.AddField(
            model_name='item',
            name='view_pager_image_1',
            field=models.ImageField(default='media/penguin.jpg', upload_to=''),
        ),
        migrations.AddField(
            model_name='item',
            name='view_pager_image_2',
            field=models.ImageField(default='media/penguin.jpg', upload_to=''),
        ),
        migrations.AddField(
            model_name='item',
            name='view_pager_image_3',
            field=models.ImageField(default='media/penguin.jpg', upload_to=''),
        ),
    ]
